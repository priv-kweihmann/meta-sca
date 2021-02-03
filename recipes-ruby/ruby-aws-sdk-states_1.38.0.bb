SUMMARY = "RubyGem: aws-sdk-states"
DESCRIPTION = "Official AWS Ruby gem for AWS Step Functions (AWS SFN)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "378a9bf79320db6794b6e9736ffcb2c9"
SRC_URI[sha256sum] = "f5852af34604054c9aff50920980bb70e3e298e87acd78696ffe2cad572601ee"

GEM_NAME = "aws-sdk-states"

inherit rubygems
