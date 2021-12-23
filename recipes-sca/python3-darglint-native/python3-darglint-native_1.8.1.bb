SUMMARY = "A python documentation linter"
DESCRIPTION = "A python documentation linter which checks that the docstring description matches the definition"
HOMEPAGE = "https://github.com/terrencepreilly/darglint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=909f5d1d9b02b61f9a881c944b0ec36a"

SRC_URI += "git://github.com/terrencepreilly/darglint.git;branch=master;protocol=https \
            file://darglint.sca.description"
SRCREV = "abc26b768cd7135d848223ba53f68323593c33d5"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/darglint.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
