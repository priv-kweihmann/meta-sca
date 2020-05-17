SUMMARY = "NPM: eslint-plugin-standard"
DESCRIPTION = "ESlint Plugin for the Standard Linter"
HOMEPAGE = "https://github.com/standard/eslint-plugin-standard#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=775a0e2f7c1351de15da279fe577da15"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-standard/-/eslint-plugin-standard-4.0.1.tgz"
SRC_URI[md5sum] = "1f4b2624b2523bc0a5a905adfcd80888"
SRC_URI[sha256sum] = "f91f4d840439f304c23bde18dd15ac4ed5412a30fdc79bbb284ae711d1c8cb37"

NPM_PKGNAME = "eslint-plugin-standard"

inherit npmhelper
inherit native
