SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-17.0.0.tgz"
SRC_URI[md5sum] = "4c55238be664252b9ba999246a5a3891"
SRC_URI[sha256sum] = "7a9e84c6017831eb96244fbc1bb8bc705c10f1df8443ef94c05502227fee673c"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
