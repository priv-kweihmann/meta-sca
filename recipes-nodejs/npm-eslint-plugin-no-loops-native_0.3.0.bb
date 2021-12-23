SUMMARY = "NPM: eslint-plugin-no-loops"
DESCRIPTION = "Disallow loops"
HOMEPAGE = "https://github.com/buildo/eslint-plugin-no-loops#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d90196035b4be18c4e1091cf197406b6"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-loops/-/eslint-plugin-no-loops-0.3.0.tgz"
SRC_URI[md5sum] = "e5f01b42829154f95006e6ebee78039c"
SRC_URI[sha256sum] = "4295656be3ebcc665529e6b441309e3f5a2dc3687154721d131ad4b1ceb1c0e6"

NPM_PKGNAME = "eslint-plugin-no-loops"

inherit npmhelper
inherit native
