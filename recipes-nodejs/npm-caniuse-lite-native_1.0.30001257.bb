SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001257.tgz"
SRC_URI[md5sum] = "15c177b0092625e46259e26dd9f83b95"
SRC_URI[sha256sum] = "ff4218aa9e8b3d29bca30d02d4c17497eeb5b79ccb231cf94d0c175a38156ee5"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
