SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=236223e5e3d78373999d226cfb563000"

SRC_URI_append = " file://vulture.sca.description"
SRC_URI[md5sum] = "de89365d371153a03c773c96ce4e79fa"
SRC_URI[sha256sum] = "7b94784ededbf8e2913b5142dc875d8f26de7c903b37cd2d8f478f79275f7ce9"

PYPI_PACKAGE = "vulture"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/vulture.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
