SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "09d14348a6a6bcad5e194958c6867b07"
SRC_URI[sha256sum] = "b78591a3bf37b096039e4e82a940a9ded8ce2babedc3f6943d6c2079b89b6bc7"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
