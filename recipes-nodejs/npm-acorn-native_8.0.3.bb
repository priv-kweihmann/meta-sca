SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.0.3.tgz"
SRC_URI[md5sum] = "588122be3a79de74277ea32da3292823"
SRC_URI[sha256sum] = "517a9e8640f0fc951e4c3c235a21f4e77d74635f175a3f8f964c41a700f0ed4e"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
