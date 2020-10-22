SUMMARY = "NPM: eslint-plugin-standard"
DESCRIPTION = "ESlint Plugin for the Standard Linter"
HOMEPAGE = "https://github.com/standard/eslint-plugin-standard#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=775a0e2f7c1351de15da279fe577da15"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-standard/-/eslint-plugin-standard-4.0.2.tgz"
SRC_URI[md5sum] = "cd9b249f5a1d133ab549fef2998bfca9"
SRC_URI[sha256sum] = "4b554074af3cf88abac59d1a995dab0a2b7e4e4e15a3a45654d9cbbdf5279638"

NPM_PKGNAME = "eslint-plugin-standard"

inherit npmhelper
inherit native
