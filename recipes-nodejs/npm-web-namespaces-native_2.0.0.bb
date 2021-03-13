SUMMARY = "NPM: web-namespaces"
DESCRIPTION = "Map of web namespaces"
HOMEPAGE = "https://github.com/wooorm/web-namespaces#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-namespaces/-/web-namespaces-2.0.0.tgz"
SRC_URI[md5sum] = "6f498014422fdfac15cbc371d283f7b6"
SRC_URI[sha256sum] = "bcdf185e5f82b8146367636956271a6e1fc1b03a5bb630ec2d6346d61c766b45"

NPM_PKGNAME = "web-namespaces"

inherit npmhelper
inherit native
