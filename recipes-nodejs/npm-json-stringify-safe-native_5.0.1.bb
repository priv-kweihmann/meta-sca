SUMMARY = "NPM: json-stringify-safe"
DESCRIPTION = "Like JSON.stringify, but doesn't blow up on circular refs."
HOMEPAGE = "https://github.com/isaacs/json-stringify-safe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/json-stringify-safe/-/json-stringify-safe-5.0.1.tgz"
SRC_URI[md5sum] = "19316b96acffad93c4ff6774b4af6465"
SRC_URI[sha256sum] = "b7fbbf65c0bff6d47f516c98638229dff0e981d0edfffecbcf971d7fe361928a"

S = "${WORKDIR}/package"

NPM_PKGNAME = "json-stringify-safe"

inherit npmhelper
inherit native
