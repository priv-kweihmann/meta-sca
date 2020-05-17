SUMMARY = "NPM: ci-info"
DESCRIPTION = "Get details about the current Continuous Integration environment"
HOMEPAGE = "https://github.com/watson/ci-info"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec"

SRC_URI = "https://registry.npmjs.org/ci-info/-/ci-info-2.0.0.tgz"
SRC_URI[md5sum] = "5cf88eb88dd4041e2f66f27e7c4ca6ba"
SRC_URI[sha256sum] = "2959f40b55ad201d6e364db8969537b222067397fb9df1002d28427a332056b9"

NPM_PKGNAME = "ci-info"

inherit npmhelper
inherit native
