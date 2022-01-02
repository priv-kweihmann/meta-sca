SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001295.tgz"
SRC_URI[md5sum] = "5f33a69fcf37440ddf769a8e5715eb4c"
SRC_URI[sha256sum] = "dcae8965e02c907f4ed3657ecacb6c8358119bbd35792abc75fe133cefa1bb42"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
