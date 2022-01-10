SUMMARY = "PHP static code analyzer"
DESCRIPTION = "PHP_CodeSniffer tokenizes PHP, JavaScript and CSS files and detects violations of a defined set of coding standards"
HOMEPAGE = "https://github.com/squizlabs/PHP_CodeSniffer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://licence.txt;md5=f21955da1cd3e318b7472e2f6f131c68"

SRC_URI = "git://github.com/squizlabs/PHP_CodeSniffer.git;branch=master;protocol=https"
SRCREV = "5e4e71592f69da17871dba6e80dd51bce74a351a"
PHPCOMPOSER_PKGS_NAME = "squizlabs/php_codesniffer=${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "phpcodesniffer"

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

FILES:${PN} = "${bindir}"
