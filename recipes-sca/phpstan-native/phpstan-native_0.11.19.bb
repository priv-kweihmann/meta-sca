SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"

HOMEPAGE = "https://github.com/phpstan/phpstan"

SRC_URI = " git://github.com/phpstan/phpstan.git;protocol=https;nobranch=1;tag=${PV} \
            file://phpstan.sca.description \
            file://phpstan.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

S = "${WORKDIR}/git"

PHPCOMPOSER_PKGS_NAME = "phpstan/phpstan:${PV}"

inherit native
inherit phpcomposer

FILES_${PN} = "${bindir} ${datadir}"

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/phpstan.sca.description ${D}${datadir}/
    install ${WORKDIR}/phpstan.sca.score ${D}${datadir}/
}

