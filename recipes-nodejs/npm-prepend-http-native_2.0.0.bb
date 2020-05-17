SUMMARY = "NPM: prepend-http"
DESCRIPTION = "Prepend `http://` to humanized URLs like todomvc.com and localhost"
HOMEPAGE = "https://github.com/sindresorhus/prepend-http#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prepend-http/-/prepend-http-2.0.0.tgz"
SRC_URI[md5sum] = "970fd3cce6479e106d2af499049b475e"
SRC_URI[sha256sum] = "d8aeb929345e713c012caf2d55399222ad86bb200f1c7a21ea8b92fdcf4eacfe"

NPM_PKGNAME = "prepend-http"

inherit npmhelper
inherit native
