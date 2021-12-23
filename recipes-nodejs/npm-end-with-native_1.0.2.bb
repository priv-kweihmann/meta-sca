SUMMARY = "NPM: end-with"
DESCRIPTION = "Determines whether a string ends with the characters of another string."
HOMEPAGE = "https://github.com/gearcase/end-with#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3c405c5cf3e7cd5f856be25608ea5def"

SRC_URI = "https://registry.npmjs.org/end-with/-/end-with-1.0.2.tgz"
SRC_URI[md5sum] = "a5cd3c3b4d8733f6fe68b235333de5d2"
SRC_URI[sha256sum] = "eb3beb0d21745dcea5cc89bcaf682889ee9418f83d4bf329c509d8fa2b038a42"

NPM_PKGNAME = "end-with"

inherit npmhelper
inherit native
