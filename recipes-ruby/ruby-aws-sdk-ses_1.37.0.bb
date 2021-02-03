SUMMARY = "RubyGem: aws-sdk-ses"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Email Service (Amazon SES)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5308ffc617e7c2563cd5c89f7ba090c4"
SRC_URI[sha256sum] = "de1b708027d97bb673c090c24c2e8c7975b6eb1087dc158e47ba508aa79785c8"

GEM_NAME = "aws-sdk-ses"

inherit rubygems
