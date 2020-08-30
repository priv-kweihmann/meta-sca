SUMMARY = "A python documentation linter"
DESCRIPTION = "A python documentation linter which checks that the docstring description matches the definition"
HOMEPAGE = "https://github.com/terrencepreilly/darglint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=909f5d1d9b02b61f9a881c944b0ec36a"

SRC_URI += "git://github.com/terrencepreilly/darglint.git;protocol=https \
            file://darglint.sca.description"
SRCREV = "d2d0f45861cfe7ed8d0a916eca181b144ed77cba"
S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/darglint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
