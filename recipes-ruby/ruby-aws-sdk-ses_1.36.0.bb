SUMMARY = "RubyGem: aws-sdk-ses"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Email Service (Amazon SES)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ecc4a49d6f803941d67d4ae1edf9edc6"
SRC_URI[sha256sum] = "29dc93658eed208e44b85840ec7284d0b699e84749db9b24a504b0f89a14b066"

GEM_NAME = "aws-sdk-ses"

inherit rubygems
