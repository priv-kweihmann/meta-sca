SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"
HOMEPAGE = "https://github.com/phpstan/phpstan"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

SRC_URI = "git://github.com/phpstan/phpstan.git;protocol=https \
           file://phpstan.sca.description"
SRCREV = "2e4738cd67e0163861a065180eff7eb5c8417d6e"
PHPCOMPOSER_PKGS_NAME = "phpstan/phpstan:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpstan.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
