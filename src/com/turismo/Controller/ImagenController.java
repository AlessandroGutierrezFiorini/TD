package com.turismo.Controller;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.turismo.Dao.Impl.ImagenDaoImpl;
import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;
import com.turismo.Service.CabanaService;
import com.turismo.Service.ComplejoService;
import com.turismo.Service.ImagenService;
import com.turismo.Service.LugarService;
import com.turismo.util.FileUpload;

@Controller
@RequestMapping("/image")
public class ImagenController {

	final static String local = "C:\\Users\\Alessandro\\Documents\\workspace-sts-3.8.1.RELEASE\\TurismoDigital";
	// final static String local = "C:\\Users\\ASUS\\Documents\\TurismoDigital";
	@Autowired
	private ImagenService imagenService;

	@Autowired
	private ComplejoService complejoService;

	@Autowired
	private CabanaService cabanaService;

	@Autowired
	private LugarService lugarService;

	@RequestMapping(method = RequestMethod.GET)
	public String showImage(Model model) {
		model.addAttribute("fileUpload", new FileUpload());
		return "/image/formImage";
	}

	@RequestMapping(value = "/lugar/{id}", method = RequestMethod.GET)
	public String showImageLugar(Model model, @PathVariable("id") int id_lugar) {
		model.addAttribute("fileUpload", new FileUpload());
		model.addAttribute("lugar", lugarService.findById(id_lugar));

		return "/image/imageLugar";
	}

	@RequestMapping(value = "/complejo/{id}", method = RequestMethod.GET)
	public String showImageComplejo(Model model, @PathVariable("id") int id_complejo) {
		model.addAttribute("fileUpload", new FileUpload());
		model.addAttribute("complejo", complejoService.findById(id_complejo));

		return "/image/imageComplejo";
	}

	@RequestMapping(value = "/cabana/{id}", method = RequestMethod.GET)
	public String showImageCabana(Model model, @PathVariable("id") int id_cabana) {
		model.addAttribute("fileUpload", new FileUpload());
		model.addAttribute("cabana", cabanaService.findById(id_cabana));

		return "/image/imageCabana";
	}

	@RequestMapping(value = "/cabanaUpload", method = RequestMethod.POST)
	public String uploadImageCabana(Model model, FileUpload fileUpload, @RequestParam("id_cabana") int id_cabana) {

		Cabana cabana = cabanaService.findById(id_cabana);

		if (fileUpload.getFile().getSize() > 0
				&& StringUtils.contains(fileUpload.getFile().getOriginalFilename().toString(), "jpg")) {
			System.out.println("FILE: " + fileUpload);
			try {
				BufferedImage buffer = ImageIO.read(fileUpload.getFile().getInputStream());
				Graphics g = buffer.getGraphics();
				String path = local + "\\TD\\WebContent\\WEB-INF\\Images\\Complejos\\"
						+ cabana.getComplejo().getNombre() + "\\" + cabana.getNumero() + "\\";

				File out = new File(path + fileUpload.getFile().getOriginalFilename());
				if (!out.exists()) {
					out.mkdirs();
				}

				if (ImageIO.write(buffer, "jpg", out)) {
					cabana.setImage(path + fileUpload.getFile().getOriginalFilename());
					cabanaService.saveOrUpdate(cabana);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("FILE: NULL");

		}
		return "redirect:/cabana/listar";
	}

	@RequestMapping(value = "/complejoUpload", method = RequestMethod.POST)
	public String uploadImageComplejo(Model model, FileUpload fileUpload,
			@RequestParam("id_complejo") int id_complejo) {

		Complejo complejo = complejoService.findById(id_complejo);

		if (fileUpload.getFile().getSize() > 0
				&& StringUtils.contains(fileUpload.getFile().getOriginalFilename().toString(), "jpg")) {
			System.out.println("FILE: " + fileUpload);
			try {
				BufferedImage buffer = ImageIO.read(fileUpload.getFile().getInputStream());
				Graphics g = buffer.getGraphics();
				String path = local + "\\TD\\WebContent\\WEB-INF\\Images\\Complejos\\" + complejo.getNombre() + "\\";

				File out = new File(path + fileUpload.getFile().getOriginalFilename());
				if (!out.exists()) {
					out.mkdirs();
				}

				if (ImageIO.write(buffer, "jpg", out)) {
					complejo.setImagen(path + fileUpload.getFile().getOriginalFilename());
					complejoService.saveOrUpdate(complejo);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("FILE: NULL");

		}
		return "redirect:/complejo/listar";
	}

	@RequestMapping(value = "/lugarUpload", method = RequestMethod.POST)
	public String uploadImageLugar(Model model, FileUpload fileUpload, @RequestParam("id_lugar") int id_lugar) {

		Lugar lugar = lugarService.findById(id_lugar);

		if (fileUpload.getFile().getSize() > 0
				&& StringUtils.contains(fileUpload.getFile().getOriginalFilename().toString(), "jpg")) {
			System.out.println("FILE: " + fileUpload);
			try {
				BufferedImage buffer = ImageIO.read(fileUpload.getFile().getInputStream());
				Graphics g = buffer.getGraphics();
				String path = local + "\\TD\\WebContent\\WEB-INF\\Images\\Lugares\\" + lugar.getNombre() + "\\";

				File out = new File(path + fileUpload.getFile().getOriginalFilename());
				if (!out.exists()) {
					out.mkdirs();
				}

				if (ImageIO.write(buffer, "jpg", out)) {
					lugar.setImagen(path + fileUpload.getFile().getOriginalFilename());
					lugarService.saveOrUpdate(lugar);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("FILE: NULL");

		}
		return "redirect:/complejo/listar";
	}

}
