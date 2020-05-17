SUMMARY = "NPM: trim-trailing-lines"
DESCRIPTION = "Remove final line feeds from a string"
HOMEPAGE = "https://github.com/wooorm/trim-trailing-lines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/trim-trailing-lines/-/trim-trailing-lines-1.1.3.tgz"
SRC_URI[md5sum] = "8ab5cb67b738a6e35054f6f33ab030ba"
SRC_URI[sha256sum] = "c50160e7ee92e3d3da92a8ced6d3d30ef1d4f1fdcf6ab95686c85cbfec17d2e5"

NPM_PKGNAME = "trim-trailing-lines"

inherit npmhelper
inherit native
