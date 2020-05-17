SUMMARY = "NPM: is-alphanumeric"
DESCRIPTION = "Check if a string only contains alphanumeric characters"
HOMEPAGE = "https://github.com/arthurvr/is-alphanumeric#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=bfcc9617a965b5c995c74a0993d31c9c"

SRC_URI = "https://registry.npmjs.org/is-alphanumeric/-/is-alphanumeric-1.0.0.tgz"
SRC_URI[md5sum] = "d05ab86c2ea3cb339cb3514afbc90a39"
SRC_URI[sha256sum] = "5a4125f4847ec6129af121b43e5bf8e588935b9b25fbabd1ddfccdbe0e729a2a"

NPM_PKGNAME = "is-alphanumeric"

inherit npmhelper
inherit native
