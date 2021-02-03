SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "Official AWS Ruby gem for AWS Server Migration Service (SMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1b4859d0002d7f4af0d429d60bf3815d"
SRC_URI[sha256sum] = "0330217e9b2f574d11fb56443151a0c6b715fdaf7a362e7a4a9faa974e5f4104"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
