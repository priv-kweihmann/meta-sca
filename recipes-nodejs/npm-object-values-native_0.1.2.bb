SUMMARY = "NPM: object_values"
DESCRIPTION = "polyfill for es8 Object.values"
HOMEPAGE = "https://github.com/KhaledElAnsari/Object.values#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object_values/-/object_values-0.1.2.tgz"
SRC_URI[md5sum] = "0e4c48838d6512b17f6a7ffe00487475"
SRC_URI[sha256sum] = "bcea6f59d96a29f849145b19919a95cec463665e49f168fd031a83bec7469369"

NPM_PKGNAME = "object_values"

inherit npmhelper
inherit native
