SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "77e93588186d18887d7766106dedf6e8"
SRC_URI[sha256sum] = "d57f9897ec95098eb4b9cec300480045fdc9fee67ee2912a02ab3e500d5c79b6"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
