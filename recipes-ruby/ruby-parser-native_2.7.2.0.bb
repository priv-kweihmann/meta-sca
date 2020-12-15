SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "fbf1640132d6b96166eddcf70e36b722"
SRC_URI[sha256sum] = "dfd0e872fe3ca330cdbb9222ab14f0a2e254749f78344b791143510f4cadefb8"

GEM_NAME = "parser"

inherit rubygems
inherit native
