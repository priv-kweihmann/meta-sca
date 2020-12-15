SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "Official AWS Ruby gem for AWS Server Migration Service (SMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "199680fb13a332e6017b64cba37d277d"
SRC_URI[sha256sum] = "f5e983cf1f668b420caffee192230526e4f93e85e59f35f33de8c5387cd28e8a"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
