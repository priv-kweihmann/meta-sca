SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"
HOMEPAGE = "https://github.com/phpstan/phpstan"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

SRC_URI = "git://github.com/phpstan/phpstan.git;branch=1.5.x;protocol=https"
SRCREV = "bbf68cae24f6dc023c607ea0f87da55dd9d55c2b"
PHPCOMPOSER_PKGS_NAME = "phpstan/phpstan:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "phpstan"

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

FILES:${PN} = "${bindir}"
