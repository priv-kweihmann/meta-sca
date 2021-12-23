SUMMARY = "NPM: spdx-expression-parse"
DESCRIPTION = "parse SPDX license expressions"
HOMEPAGE = "https://github.com/jslicense/spdx-expression-parse.js#readme"

DEPENDS = "npm-spdx-exceptions-native npm-spdx-license-ids-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=35a411d082d4487ab0e0287014cddf80"

SRC_URI = "https://registry.npmjs.org/spdx-expression-parse/-/spdx-expression-parse-3.0.1.tgz"
SRC_URI[md5sum] = "69faa9bdd7b8eaf4d1e8a91f3dce9fb7"
SRC_URI[sha256sum] = "01a89e6a60412e344e74ed81f370fd7d33bbb658773f0cee6e2f15ea15449d1f"

NPM_PKGNAME = "spdx-expression-parse"

inherit npmhelper
inherit native
