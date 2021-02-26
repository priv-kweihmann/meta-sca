SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001192.tgz"
SRC_URI[md5sum] = "d53bd7e37c4a8dd9da7d41a567837c92"
SRC_URI[sha256sum] = "2970d3a59677de8fdf9a4c2d558ab4530582a310d209c244601f204aa7b91a48"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
