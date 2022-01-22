SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"
HOMEPAGE = "https://github.com/phpstan/phpstan"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

SRC_URI = "git://github.com/phpstan/phpstan.git;branch=master;protocol=https"
SRCREV = "1dd8f3e40bf7aa30031a75c65cece99220a161b8"
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
