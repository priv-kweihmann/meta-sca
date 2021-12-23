SUMMARY = "NPM: eslint-plugin-standard"
DESCRIPTION = "ESlint Plugin for the Standard Linter"
HOMEPAGE = "https://github.com/standard/eslint-plugin-standard#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=775a0e2f7c1351de15da279fe577da15"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-standard/-/eslint-plugin-standard-4.1.0.tgz"
SRC_URI[md5sum] = "c2b676cabfede88518d6333cb5ce8bad"
SRC_URI[sha256sum] = "362fea50d2c0f159be8b168e7bc00928bd0c7041a485612ad7d57353e92f1735"

NPM_PKGNAME = "eslint-plugin-standard"

inherit npmhelper
inherit native
