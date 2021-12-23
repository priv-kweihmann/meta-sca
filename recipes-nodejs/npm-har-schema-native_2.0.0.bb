SUMMARY = "NPM: har-schema"
DESCRIPTION = "JSON Schema for HTTP Archive (HAR)"
HOMEPAGE = "https://github.com/ahmadnassri/har-schema"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bfa81591facc9224e4c7451c8dc12958"

SRC_URI = "https://registry.npmjs.org/har-schema/-/har-schema-2.0.0.tgz"
SRC_URI[md5sum] = "6277eec9cab1d80a59ddf153574651c0"
SRC_URI[sha256sum] = "2e7b84af0567ad7c6a5ddcb5f4c1bcc2bd29d4b089d734f628ac08517081be26"

S = "${WORKDIR}/package"

NPM_PKGNAME = "har-schema"

inherit npmhelper
inherit native
