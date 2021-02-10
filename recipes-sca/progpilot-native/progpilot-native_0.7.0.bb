SUMMARY = "A static analysis tool for security"
HOMEPAGE = "https://github.com/designsecurity/progpilot"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1253fbacf108afc870105327c6f05a94"

SRC_URI = "git://github.com/designsecurity/progpilot.git;protocol=https \
           file://progpilot.sca.description"
SRCREV = "abe1de2f0bbdd21d80197711cad91e2c9fef952b"
PHPCOMPOSER_PKGS_NAME = "designsecurity/progpilot:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit php-ext
inherit sca-description
inherit native

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/progpilot.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
