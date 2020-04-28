SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"
HOMEPAGE = "https://github.com/phpstan/phpstan"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

SRC_URI = "git://github.com/phpstan/phpstan.git;protocol=https \
           file://phpstan.sca.description"
SRCREV = "1ce27fe29c8660a27926127d350d53d80c4d4286"
PHPCOMPOSER_PKGS_NAME = "phpstan/phpstan:${PV}"

S = "${WORKDIR}/git"

inherit native
inherit phpcomposer
inherit sca-sanity

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpstan.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
