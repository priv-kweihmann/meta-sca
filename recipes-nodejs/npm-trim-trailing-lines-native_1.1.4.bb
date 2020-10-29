SUMMARY = "NPM: trim-trailing-lines"
DESCRIPTION = "Remove final line feeds from a string"
HOMEPAGE = "https://github.com/wooorm/trim-trailing-lines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim-trailing-lines/-/trim-trailing-lines-1.1.4.tgz"
SRC_URI[md5sum] = "b0b97ae135fd708ac77ebacbde495810"
SRC_URI[sha256sum] = "6095d5ca5736a1b0a943e295c0a782ecdde21a918562ddbcec2e9cc63f8d6aa0"

NPM_PKGNAME = "trim-trailing-lines"

inherit npmhelper
inherit native
