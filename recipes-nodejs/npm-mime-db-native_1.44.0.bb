SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.44.0.tgz"
SRC_URI[md5sum] = "c69d806183b75d1ef79b6a420c72c462"
SRC_URI[sha256sum] = "c7edc9e135a85a0efcdec9421851e06ac1ccdc13622d39622cc858833327a36a"

S = "${WORKDIR}/package"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
