SUMMARY = "NPM: path-parse"
DESCRIPTION = "Node.js path.parse() ponyfill"
HOMEPAGE = "https://github.com/jbgutierrez/path-parse#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4b940f9668dfcb796d2cb98ad94692df"

SRC_URI = "https://registry.npmjs.org/path-parse/-/path-parse-1.0.6.tgz"
SRC_URI[md5sum] = "9d136901e48237b9e6677bf3e415fc0b"
SRC_URI[sha256sum] = "a4a932d61bf4bd3f7b7a8020434e71101195862a86d0ce1e147e7a92cfe6a11f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "path-parse"

inherit npmhelper
inherit native
