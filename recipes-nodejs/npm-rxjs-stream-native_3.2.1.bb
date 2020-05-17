SUMMARY = "NPM: rxjs-stream"
DESCRIPTION = "nodejs streams for rxjs 6"
HOMEPAGE = "https://github.com/Jason3S/rx-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

SRC_URI = "https://registry.npmjs.org/rxjs-stream/-/rxjs-stream-3.2.1.tgz"
SRC_URI[md5sum] = "87fc2c38d3576e1fd89462570e1c7141"
SRC_URI[sha256sum] = "e1b0235c595e6ee2debd9a78b8c43d70213fee6bceab977d5bca7aba955d02ea"

S = "${WORKDIR}/package"

NPM_PKGNAME = "rxjs-stream"

inherit npmhelper
inherit native
