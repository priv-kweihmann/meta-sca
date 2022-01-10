SUMMARY = "PHP vulnerability finder"
DESCRIPTION = "phpcs-security-audit is a set of PHP_CodeSniffer rules that finds vulnerabilities and weaknesses related to security in PHP code"
HOMEPAGE = "https://github.com/FloeDesignTechnologies/phpcs-security-audit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=412af50a7c6ed96fe188e6672d9f3d9b"

DEPENDS += "phpcodesniffer-native"

SRC_URI = "git://github.com/FloeDesignTechnologies/phpcs-security-audit.git;branch=master;protocol=https"
SRCREV = "68a6c53a57156a5efb2073b1eb3f2d79a46c9dc2"
PHPCOMPOSER_PKGS_NAME = "pheromone/phpcs-security-audit=${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "phpsecaudit"

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install:append() {
    ## We need to move the ruleset so it gets recognized by phpcodesniffer
    mv ${D}${bindir}/phpcs-security-audit/vendor/pheromone/phpcs-security-audit/Security \
        ${D}${bindir}/phpcs-security-audit/vendor/squizlabs/php_codesniffer/src/Standards/
}

FILES:${PN} = "${bindir}"
