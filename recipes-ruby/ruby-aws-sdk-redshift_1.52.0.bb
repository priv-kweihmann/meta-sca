SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c88391005fdfe4d66330f5fe808a3ac5"
SRC_URI[sha256sum] = "bf330be3715792aad569c6feb3e100b7722b4bf9ad593c0f72466a79af98f6b4"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
