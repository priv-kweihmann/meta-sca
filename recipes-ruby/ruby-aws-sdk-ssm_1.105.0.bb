SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c771b119073cfddced3481a4dfb37e1a"
SRC_URI[sha256sum] = "2f122303f9463c305eaa58dae530f923b4b45bd052edf241f09eed074ebd8eb4"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
