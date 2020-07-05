SUMMARY = "A Spell Checker for Code! (intentionally outdated for testing)"
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "git://github.com/streetsidesoftware/cspell.git;protocol=https;tag=v${PV}"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS += "nodejs-native"
S = "${WORKDIR}/git"

inherit sca

do_install() {
    export HOME=${B}
    npm install --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev
}

SCA_BLACKLIST_proselint += "${PN}"

SCA_ENABLED_MODULES = "retire npmaudit"
