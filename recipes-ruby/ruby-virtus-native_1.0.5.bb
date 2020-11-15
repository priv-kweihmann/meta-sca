SUMMARY = "Attributes on Steroids for Plain Old Ruby Objects"
HOMEPAGE = "https://github.com/solnic/virtus"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e82a465aa1c29f8f04f81d00041f1cf"

DEPENDS += "\
            ruby-axiom-types-native \
            ruby-coercible-native \
            ruby-descendants-tracker-native \
            ruby-equalizer-native \
            "

SRC_URI[md5sum] = "83051103a3439993d685a0c023b5f9f2"
SRC_URI[sha256sum] = "d3053b9ff62d3f8b7b233f7e1aa9530b73ed7e541bee2c62f2c711362287371a"

GEM_NAME = "virtus"

inherit rubygemsnative
