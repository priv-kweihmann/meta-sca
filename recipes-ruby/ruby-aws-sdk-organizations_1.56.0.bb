SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e8f61a16d7f92f23421905e15a41e9fd"
SRC_URI[sha256sum] = "574a982037993fd31505d9de2229e8825f0710fb75d7ab86c4aeaaa740f37018"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
