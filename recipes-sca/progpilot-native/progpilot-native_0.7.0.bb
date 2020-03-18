SUMMARY = "A static analysis tool for security"

HOMEPAGE = "https://github.com/designsecurity/progpilot"

SRC_URI = " git://github.com/designsecurity/progpilot.git;protocol=https;tag=v${PV} \
            file://progpilot.sca.description"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1253fbacf108afc870105327c6f05a94"

S = "${WORKDIR}/git"

PHPCOMPOSER_PKGS_NAME = "designsecurity/progpilot:${PV}"

inherit native
inherit phpcomposer
inherit php-ext
inherit sca-sanity

FILES_${PN} = "${bindir} ${datadir}"

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/progpilot.sca.description ${D}${datadir}/
}

