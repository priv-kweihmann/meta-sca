SUMMARY = "NPM: braces"
DESCRIPTION = "Bash-like brace expansion, implemented in JavaScript. Safer than other brace expansion libs, with complete support for the Bash 4.3 braces specification, without sacrificing speed."
HOMEPAGE = "https://github.com/micromatch/braces"

DEPENDS = "npm-fill-range-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ccdc0959f67943eb090f7e7c299621af"

SRC_URI = "https://registry.npmjs.org/braces/-/braces-3.0.2.tgz"
SRC_URI[md5sum] = "3ed11e666a13cb0da288c6f445b2601f"
SRC_URI[sha256sum] = "735881928fd4cf6e0c469c7ec6f66f49133563b840ef2f6c6098943a4250eace"

NPM_PKGNAME = "braces"

inherit npmhelper
inherit native
