SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001270.tgz"
SRC_URI[md5sum] = "fbb9726b89e202ace559b96a1efce388"
SRC_URI[sha256sum] = "0878bc74fbe6032da055c540ee3f5755fe6f409e893fa6a72062f9f9df89336f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
