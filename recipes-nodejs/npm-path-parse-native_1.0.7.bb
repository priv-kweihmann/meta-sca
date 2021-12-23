SUMMARY = "NPM: path-parse"
DESCRIPTION = "Node.js path.parse() ponyfill"
HOMEPAGE = "https://github.com/jbgutierrez/path-parse#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4b940f9668dfcb796d2cb98ad94692df"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-parse/-/path-parse-1.0.7.tgz"
SRC_URI[md5sum] = "0eb085db2ac7a62ab20dca9405fef1b0"
SRC_URI[sha256sum] = "a07a198ca727816296616928237bfab6571f211750d798030b3b7a3f4a5473a3"

NPM_PKGNAME = "path-parse"

inherit npmhelper
inherit native
