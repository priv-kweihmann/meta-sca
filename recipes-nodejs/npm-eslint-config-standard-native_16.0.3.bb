SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-16.0.3.tgz"
SRC_URI[md5sum] = "f46ac98e6735d1280a9bd6be1172e826"
SRC_URI[sha256sum] = "540609a816a3fcf0ed968fff1960d4e5cad0b009eae121b5f03607e4728b0d6a"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
