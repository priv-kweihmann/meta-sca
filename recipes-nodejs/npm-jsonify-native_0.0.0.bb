SUMMARY = "NPM: jsonify"
DESCRIPTION = "JSON without touching any globals"


LICENSE = "Unlicense"
# does not provide any license text
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/Unlicense;md5=1d267ceb3a8d8f75f1be3011ee4cbf53"

SRC_URI = "https://registry.npmjs.org/jsonify/-/jsonify-0.0.0.tgz"
SRC_URI[md5sum] = "78cc678249f2a175db1cffbd5bb25a14"
SRC_URI[sha256sum] = "030f926cb3d18933c9bce7fe3d1dddbde73b91532dc4cada98214337e811c89c"

NPM_PKGNAME = "jsonify"

inherit npmhelper
inherit native
